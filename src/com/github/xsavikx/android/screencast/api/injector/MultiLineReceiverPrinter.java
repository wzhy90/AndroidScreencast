package com.github.xsavikx.android.screencast.api.injector;

import com.android.ddmlib.MultiLineReceiver;

public class MultiLineReceiverPrinter extends MultiLineReceiver {

  @Override
  public boolean isCancelled() {
    return false;
  }

  @Override
  public void processNewLines(String[] arg0) {
    for (String elem : arg0) {
      System.out.println(elem);
    }
  }

}
