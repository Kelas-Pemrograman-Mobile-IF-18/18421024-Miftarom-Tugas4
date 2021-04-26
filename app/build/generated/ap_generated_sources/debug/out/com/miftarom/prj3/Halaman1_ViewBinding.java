// Generated code from Butter Knife. Do not modify!
package com.miftarom.prj3;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Halaman1_ViewBinding implements Unbinder {
  private Halaman1 target;

  private View view7f080057;

  @UiThread
  public Halaman1_ViewBinding(Halaman1 target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Halaman1_ViewBinding(final Halaman1 target, View source) {
    this.target = target;

    View view;
    target.edtNama = Utils.findRequiredViewAsType(source, R.id.edtNama, "field 'edtNama'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btnPindah, "method 'pindah'");
    view7f080057 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.pindah();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Halaman1 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.edtNama = null;

    view7f080057.setOnClickListener(null);
    view7f080057 = null;
  }
}
