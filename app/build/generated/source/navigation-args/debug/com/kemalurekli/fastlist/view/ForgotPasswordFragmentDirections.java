package com.kemalurekli.fastlist.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.kemalurekli.fastlist.AppGraphDirections;
import com.kemalurekli.fastlist.R;

public class ForgotPasswordFragmentDirections {
  private ForgotPasswordFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionForgotPasswordFragmentToSignInFragment() {
    return new ActionOnlyNavDirections(R.id.action_forgotPasswordFragment_to_signInFragment);
  }

  @NonNull
  public static NavDirections actionGlobalProfileFragment() {
    return AppGraphDirections.actionGlobalProfileFragment();
  }
}
