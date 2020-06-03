package com.example.myapplication;

import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class PDFOpener extends AppCompatActivity {
    PDFView pdfView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pdfView = findViewById(R.id.pdfViewer);
        String getItem = getIntent().getStringExtra("pdf");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        if (getItem.equals("Mathématique")) {
            toolbar.setTitle(getItem);
            pdfView.fromAsset("Math.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizont²al swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .scrollHandle(null)
                    .enableAntialiasing(true)
                    .spacing(10)
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int i, float v) {

                        }
                    })
                    .onDraw(new OnDrawListener() {
                        @Override
                        public void onLayerDrawn(Canvas canvas, float v, float v1, int i) {

                        }
                    })
                    .onDrawAll(new OnDrawListener() {
                        @Override
                        public void onLayerDrawn(Canvas canvas, float v, float v1, int i) {

                        }
                    })
                    .onPageError(new OnPageErrorListener() {
                        @Override
                        public void onPageError(int i, Throwable throwable) {
                            Toast.makeText(PDFOpener.this, "Error", Toast.LENGTH_LONG).show();
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int i, int i1) {

                        }
                    })
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent motionEvent) {
                            return true;
                        }
                    })
                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int i) {
                            pdfView.fitToWidth(0);
                        }
                    })
                    .pageFitPolicy(FitPolicy.WIDTH)
                    .enableAnnotationRendering(true)// render annotations (such as comments, colors or forms)
                    .load();
        }
        if (getItem.equals("MATHS_ZINSALO")) {
            toolbar.setTitle(getItem);
            pdfView.fromAsset("MATHS_ZINSALO.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizont²al swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .scrollHandle(null)
                    .enableAntialiasing(true)
                    .spacing(10)
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int i, float v) {

                        }
                    })
                    .onDraw(new OnDrawListener() {
                        @Override
                        public void onLayerDrawn(Canvas canvas, float v, float v1, int i) {

                        }
                    })
                    .onDrawAll(new OnDrawListener() {
                        @Override
                        public void onLayerDrawn(Canvas canvas, float v, float v1, int i) {

                        }
                    })
                    .onPageError(new OnPageErrorListener() {
                        @Override
                        public void onPageError(int i, Throwable throwable) {
                            Toast.makeText(PDFOpener.this, "Error", Toast.LENGTH_LONG).show();
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int i, int i1) {

                        }
                    })
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent motionEvent) {
                            return true;
                        }
                    })
                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int i) {
                            pdfView.fitToWidth(0);
                        }
                    })
                    .pageFitPolicy(FitPolicy.WIDTH)
                    .enableAnnotationRendering(true)// render annotations (such as comments, colors or forms)
                    .load();
        }
        if (getItem.equals("Programme de Math_Collège")) {
            toolbar.setTitle(getItem);
            pdfView.fromAsset("Programme_math_college.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizont²al swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .scrollHandle(null)
                    .enableAntialiasing(true)
                    .spacing(10)
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int i, float v) {

                        }
                    })
                    .onDraw(new OnDrawListener() {
                        @Override
                        public void onLayerDrawn(Canvas canvas, float v, float v1, int i) {

                        }
                    })
                    .onDrawAll(new OnDrawListener() {
                        @Override
                        public void onLayerDrawn(Canvas canvas, float v, float v1, int i) {

                        }
                    })
                    .onPageError(new OnPageErrorListener() {
                        @Override
                        public void onPageError(int i, Throwable throwable) {
                            Toast.makeText(PDFOpener.this, "Error", Toast.LENGTH_LONG).show();
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int i, int i1) {

                        }
                    })
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent motionEvent) {
                            return true;
                        }
                    })
                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int i) {
                            pdfView.fitToWidth(0);
                        }
                    })
                    .pageFitPolicy(FitPolicy.WIDTH)
                    .enableAnnotationRendering(true)// render annotations (such as comments, colors or forms)
                    .load();
        }
        if (getItem.equals("Fonction Hyperpolique")) {
            toolbar.setTitle(getItem);
            pdfView.fromAsset("fonctionhyperbolik.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizont²al swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .scrollHandle(null)
                    .enableAntialiasing(true)
                    .spacing(10)
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int i, float v) {

                        }
                    })
                    .onDraw(new OnDrawListener() {
                        @Override
                        public void onLayerDrawn(Canvas canvas, float v, float v1, int i) {

                        }
                    })
                    .onDrawAll(new OnDrawListener() {
                        @Override
                        public void onLayerDrawn(Canvas canvas, float v, float v1, int i) {

                        }
                    })
                    .onPageError(new OnPageErrorListener() {
                        @Override
                        public void onPageError(int i, Throwable throwable) {
                            Toast.makeText(PDFOpener.this, "Error", Toast.LENGTH_LONG).show();
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int i, int i1) {

                        }
                    })
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent motionEvent) {
                            return true;
                        }
                    })
                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int i) {
                            pdfView.fitToWidth(0);
                        }
                    })
                    .pageFitPolicy(FitPolicy.WIDTH)
                    .enableAnnotationRendering(true)// render annotations (such as comments, colors or forms)
                    .load();
        }

    }
}
