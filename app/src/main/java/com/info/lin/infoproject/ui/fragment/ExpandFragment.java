package com.info.lin.infoproject.ui.fragment;

import com.info.lin.infoproject.ui.base.MainBaseFragment;
import com.info.lin.infoproject.utils.constant.Constants;

/**
 * Created by lin on 2017/2/23.
 */

public class ExpandFragment extends MainBaseFragment {

    public ExpandFragment() {

    }

    @Override
    public String getFragmentType() {
        return Constants.TYPE_EXPAND_RES;
    }

    @Override
    public boolean getCanLoadMore() {
        return true;
    }

    public static ExpandFragment newInstance() {
        return new ExpandFragment();
    }
}
