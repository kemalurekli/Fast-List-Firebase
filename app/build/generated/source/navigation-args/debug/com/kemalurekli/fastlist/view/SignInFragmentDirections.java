package com.kemalurekli.fastlist.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.kemalurekli.fastlist.R;

public class SignInFragmentDirections {
  private SignInFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSignInFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_signInFragment_to_homeFragment);
  }

  @NonNull
  public static NavDirections actionSignInFragmentToSignUpFragment() {
    return new ActionOnlyNavDirections(R.id.action_signInFragment_to_signUpFragment);
  }

  @NonNull
  public static NavDirections actionSignInFragmentToForgotPasswordFragment() {
    return new ActionOnlyNavDirections(R.id.action_signInFragment_to_forgotPasswordFragment);
  }
}
