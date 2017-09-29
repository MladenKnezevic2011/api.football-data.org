package com.example.dd.retrofit1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<User> item;
    Context context;

    public RecyclerViewAdapter(Context context, List<User> item) {
        this.item = item;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_row, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String mTvCaptionRight = item.get(position).getCaption();
        String mTvLeagueRight = item.get(position).getLeague();
        String mTvYearRight = item.get(position).getYear();
        String mTvNumberOfTeamsRight = String.valueOf(item.get(position).getNumberofteams());
        String mTvCurrentMatchDay = String.valueOf(item.get(position).getCurrentmatchday());
        String mTvNumberOfMatchdays = String.valueOf(item.get(position).getNumberofmatchdays());
        String mTvNumberOfGamesRight = String.valueOf(item.get(position).getNumberofgames());
        String mTvlastUpdatedRight = item.get(position).getLastupdated();

        holder.mTvCaptionRight.setText(mTvCaptionRight);
        holder.mTvLeagueRight.setText(mTvLeagueRight);
        holder.mTvYearRight.setText(mTvYearRight);
        holder.mTvCurrentMatchDayRight.setText(mTvCurrentMatchDay);
        holder.mTvNumberOfMatchdaysRight.setText(mTvNumberOfMatchdays);
        holder.mTvNumberOfTeamsRight.setText(mTvNumberOfTeamsRight);
        holder.mTvNumberOfGamesRight.setText(mTvNumberOfGamesRight);
        holder.mTvlastUpdatedRight.setText(mTvlastUpdatedRight);
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView mTvCaptionRight;
        private TextView mTvLeagueRight;
        private TextView mTvYearRight;
        private TextView mTvCurrentMatchDayRight;
        private TextView mTvNumberOfMatchdaysRight;
        private TextView mTvNumberOfTeamsRight;
        private TextView mTvNumberOfGamesRight;
        private TextView mTvlastUpdatedRight;

        public ViewHolder(View itemView) {
            super(itemView);
            mTvCaptionRight = (TextView) itemView.findViewById(R.id.tvCaptionRight);
            mTvLeagueRight = (TextView) itemView.findViewById(R.id.tvLeagueRight);
            mTvYearRight = (TextView) itemView.findViewById(R.id.tvYearRight);
            mTvCurrentMatchDayRight = (TextView) itemView.findViewById(R.id.tvCurrentMatchDayRight);
            mTvNumberOfMatchdaysRight = (TextView) itemView.findViewById(R.id.tvNumberOfMatchdaysRight);
            mTvNumberOfTeamsRight = (TextView) itemView.findViewById(R.id.tvNumberOfTeamsRight);
            mTvNumberOfGamesRight = (TextView) itemView.findViewById(R.id.tvNumberOfGamesRight);
            mTvlastUpdatedRight = (TextView) itemView.findViewById(R.id.tvlastUpdatedRight);
        }
    }
}
