package com.kemalurekli.fastlist.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.kemalurekli.fastlist.R;

public class SignUpFragmentDirections {
  private SignUpFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSignUpFragmentToSignInFragment() {
    return new ActionOnlyNavDirections(R.id.action_signUpFragment_to_signInFragment);
  }

  @NonNull
  public static NavDirections actionSignUpFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_signUpFragment_to_homeFragment);
  }
}
