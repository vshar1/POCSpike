FROM nodesource/jessie:4.3.1

# App
COPY package.json package.json
COPY ./src/ ./src/

# Install app dependencies
RUN npm install

# CONFIGURE IMAGE
EXPOSE      9080
CMD         ["npm", "start"]