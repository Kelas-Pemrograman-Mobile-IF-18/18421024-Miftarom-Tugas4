// Generated code from Butter Knife. Do not modify!
package com.miftarom.prj3;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Halaman2_ViewBinding implements Unbinder {
  private Halaman2 target;

  @UiThread
  public Halaman2_ViewBinding(Halaman2 target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Halaman2_ViewBinding(Halaman2 target, View source) {
    this.target = target;

    target.txtNama = Utils.findRequiredViewAsType(source, R.id.txtNama, "field 'txtNama'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Halaman2 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtNama = null;
  }
}
