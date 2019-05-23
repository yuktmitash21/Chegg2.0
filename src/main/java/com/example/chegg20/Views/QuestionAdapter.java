package com.example.chegg20.Views;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chegg20.Entity.Question;
import com.example.chegg20.Model.Model;
import com.example.chegg20.R;
import com.example.chegg20.ViewModels.QuestionViewModel;

import java.util.ArrayList;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder> {
    ArrayList<Question> questionArrayList = Model.getInstanceOfModel().getQuestionInteractor().getAllQuestions();


    @NonNull
    @Override
    public QuestionViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.question_view, viewGroup, false);

        return new QuestionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionViewHolder questionViewHolder, int i) {
        Question question = questionArrayList.get(i);
        questionViewHolder.questionText.setText(question.getQuestionText());
        questionViewHolder.authorText.setText(question.getAsker().getUsername());

    }

    @Override
    public int getItemCount() {
        return questionArrayList.size();
    }

    public class QuestionViewHolder extends RecyclerView.ViewHolder {
        private TextView questionText;
        private TextView authorText;

        public QuestionViewHolder(@NonNull View itemView) {
            super(itemView);
            questionText = itemView.findViewById(R.id.text_question);
            authorText = itemView.findViewById(R.id.author);
        }
    }

}


