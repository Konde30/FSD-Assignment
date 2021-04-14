import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NavcomponentComponent } from './navcomponent/navcomponent.component';
import { HeadercomponentComponent } from './headercomponent/headercomponent.component';
import { MaincomponentComponent } from './maincomponent/maincomponent.component';
import { FootercomponentComponent } from './footercomponent/footercomponent.component';
import { AboutComponent } from './about/about.component';
import {AppRoutingModule} from './app-routing.module';
import { EducationComponent } from './education/education.component';
import { ProjectsComponent } from './projects/projects.component';
import { SkillsComponent } from './skills/skills.component';
import { GalleryComponent } from './gallery/gallery.component';
import { ContactComponent } from './contact/contact.component';
import { PrintComponent } from './print/print.component';

// import {AppRoutingModule} from './app.component/AppRoutingModule';
@NgModule({
  declarations: [
    AppComponent,
    NavcomponentComponent,
    HeadercomponentComponent,
    MaincomponentComponent,
    FootercomponentComponent,
    AboutComponent,
    EducationComponent,
    ProjectsComponent,
    SkillsComponent,
    GalleryComponent,
    ContactComponent,
    PrintComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
