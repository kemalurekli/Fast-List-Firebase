package com.kemalurekli.fastlist.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.kemalurekli.fastlist.AppGraphDirections;
import com.kemalurekli.fastlist.R;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToSignInFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_signInFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment);
  }

  @NonNull
  public static NavDirections actionGlobalProfileFragment() {
    return AppGraphDirections.actionGlobalProfileFragment();
  }
}
