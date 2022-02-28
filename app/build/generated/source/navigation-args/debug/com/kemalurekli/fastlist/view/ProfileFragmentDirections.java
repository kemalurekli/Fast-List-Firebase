package com.kemalurekli.fastlist.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.kemalurekli.fastlist.AppGraphDirections;
import com.kemalurekli.fastlist.R;

public class ProfileFragmentDirections {
  private ProfileFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionProfileFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_profileFragment_to_homeFragment);
  }

  @NonNull
  public static NavDirections actionGlobalProfileFragment() {
    return AppGraphDirections.actionGlobalProfileFragment();
  }
}
