// Generated by view binder compiler. Do not edit!
package com.uralitsports.vkcup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uralitsports.vkcup.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUserBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircleImageView avatarIV;

  @NonNull
  public final TextView friendsCount;

  @NonNull
  public final RecyclerView friendsRV;

  @NonNull
  public final Button logoutBtn;

  @NonNull
  public final TextView nameTV;

  private ActivityUserBinding(@NonNull LinearLayout rootView, @NonNull CircleImageView avatarIV,
      @NonNull TextView friendsCount, @NonNull RecyclerView friendsRV, @NonNull Button logoutBtn,
      @NonNull TextView nameTV) {
    this.rootView = rootView;
    this.avatarIV = avatarIV;
    this.friendsCount = friendsCount;
    this.friendsRV = friendsRV;
    this.logoutBtn = logoutBtn;
    this.nameTV = nameTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatarIV;
      CircleImageView avatarIV = ViewBindings.findChildViewById(rootView, id);
      if (avatarIV == null) {
        break missingId;
      }

      id = R.id.friends_count;
      TextView friendsCount = ViewBindings.findChildViewById(rootView, id);
      if (friendsCount == null) {
        break missingId;
      }

      id = R.id.friendsRV;
      RecyclerView friendsRV = ViewBindings.findChildViewById(rootView, id);
      if (friendsRV == null) {
        break missingId;
      }

      id = R.id.logoutBtn;
      Button logoutBtn = ViewBindings.findChildViewById(rootView, id);
      if (logoutBtn == null) {
        break missingId;
      }

      id = R.id.nameTV;
      TextView nameTV = ViewBindings.findChildViewById(rootView, id);
      if (nameTV == null) {
        break missingId;
      }

      return new ActivityUserBinding((LinearLayout) rootView, avatarIV, friendsCount, friendsRV,
          logoutBtn, nameTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
