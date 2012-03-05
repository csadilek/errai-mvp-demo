package org.jboss.errai.demo.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class AddContactEvent extends GwtEvent<AddContactEventHandler> {
  public static Type<AddContactEventHandler> TYPE = new Type<AddContactEventHandler>();
  
  @Override
  public Type<AddContactEventHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(AddContactEventHandler handler) {
    handler.onAddContact(this);
  }
}
