package mx.tecnm.tepic.ladm_u2_tema2_canvas

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    var imagen = BitmapFactory.decodeResource(this.resources,R.drawable.iconoa1)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        val p = Paint()

        c.drawColor(Color.BLUE)

        p.color=Color.YELLOW
        c.drawCircle(150f,150f,50f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 20f
        p.color=Color.RED
        c.drawRect(200f,500f,400f,700f,p)

        p.style = Paint.Style.FILL
        p.textSize = 70f
        p.color=Color.GRAY
        c.drawText("Maho",200f,400f,p)


        c.drawBitmap(imagen,200f, 100f,p)
    }

}