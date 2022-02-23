package com.kemalurekli.fastlist.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.kemalurekli.fastlist.R;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToSignInFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_signInFragment);
  }
}
