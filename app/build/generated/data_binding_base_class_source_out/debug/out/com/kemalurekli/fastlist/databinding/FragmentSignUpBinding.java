// Generated by view binder compiler. Do not edit!
package com.kemalurekli.fastlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kemalurekli.fastlist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button signUpButton;

  @NonNull
  public final TextInputLayout textInputLayoutEmail;

  @NonNull
  public final TextInputLayout textInputLayoutName;

  @NonNull
  public final TextInputLayout textInputLayoutPassword;

  @NonNull
  public final TextInputLayout textInputLayoutPasswordAgain;

  @NonNull
  public final TextView tvAlreadyhaveText;

  @NonNull
  public final TextView tvSignInLink;

  @NonNull
  public final TextInputEditText tvUserEmail;

  @NonNull
  public final TextInputEditText tvUserName;

  @NonNull
  public final TextInputEditText tvUserPassword;

  @NonNull
  public final TextInputEditText tvUserPasswordAgain;

  private FragmentSignUpBinding(@NonNull ConstraintLayout rootView, @NonNull Button signUpButton,
      @NonNull TextInputLayout textInputLayoutEmail, @NonNull TextInputLayout textInputLayoutName,
      @NonNull TextInputLayout textInputLayoutPassword,
      @NonNull TextInputLayout textInputLayoutPasswordAgain, @NonNull TextView tvAlreadyhaveText,
      @NonNull TextView tvSignInLink, @NonNull TextInputEditText tvUserEmail,
      @NonNull TextInputEditText tvUserName, @NonNull TextInputEditText tvUserPassword,
      @NonNull TextInputEditText tvUserPasswordAgain) {
    this.rootView = rootView;
    this.signUpButton = signUpButton;
    this.textInputLayoutEmail = textInputLayoutEmail;
    this.textInputLayoutName = textInputLayoutName;
    this.textInputLayoutPassword = textInputLayoutPassword;
    this.textInputLayoutPasswordAgain = textInputLayoutPasswordAgain;
    this.tvAlreadyhaveText = tvAlreadyhaveText;
    this.tvSignInLink = tvSignInLink;
    this.tvUserEmail = tvUserEmail;
    this.tvUserName = tvUserName;
    this.tvUserPassword = tvUserPassword;
    this.tvUserPasswordAgain = tvUserPasswordAgain;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.sign_up_button;
      Button signUpButton = ViewBindings.findChildViewById(rootView, id);
      if (signUpButton == null) {
        break missingId;
      }

      id = R.id.textInputLayout_email;
      TextInputLayout textInputLayoutEmail = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayoutEmail == null) {
        break missingId;
      }

      id = R.id.textInputLayout_name;
      TextInputLayout textInputLayoutName = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayoutName == null) {
        break missingId;
      }

      id = R.id.textInputLayout_password;
      TextInputLayout textInputLayoutPassword = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayoutPassword == null) {
        break missingId;
      }

      id = R.id.textInputLayout_password_again;
      TextInputLayout textInputLayoutPasswordAgain = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayoutPasswordAgain == null) {
        break missingId;
      }

      id = R.id.tv_alreadyhave_text;
      TextView tvAlreadyhaveText = ViewBindings.findChildViewById(rootView, id);
      if (tvAlreadyhaveText == null) {
        break missingId;
      }

      id = R.id.tv_sign_in_link;
      TextView tvSignInLink = ViewBindings.findChildViewById(rootView, id);
      if (tvSignInLink == null) {
        break missingId;
      }

      id = R.id.tv_user_email;
      TextInputEditText tvUserEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvUserEmail == null) {
        break missingId;
      }

      id = R.id.tv_user_name;
      TextInputEditText tvUserName = ViewBindings.findChildViewById(rootView, id);
      if (tvUserName == null) {
        break missingId;
      }

      id = R.id.tv_user_password;
      TextInputEditText tvUserPassword = ViewBindings.findChildViewById(rootView, id);
      if (tvUserPassword == null) {
        break missingId;
      }

      id = R.id.tv_user_password_again;
      TextInputEditText tvUserPasswordAgain = ViewBindings.findChildViewById(rootView, id);
      if (tvUserPasswordAgain == null) {
        break missingId;
      }

      return new FragmentSignUpBinding((ConstraintLayout) rootView, signUpButton,
          textInputLayoutEmail, textInputLayoutName, textInputLayoutPassword,
          textInputLayoutPasswordAgain, tvAlreadyhaveText, tvSignInLink, tvUserEmail, tvUserName,
          tvUserPassword, tvUserPasswordAgain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
