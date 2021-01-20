<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsPluginbytypeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'body' => 'body',
        'fileId' => 'file_id',
        'id' => 'id',
        'outsideBizdomain' => 'outside_bizdomain',
        'pluginId' => 'plugin_id',
        'table' => 'table',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->body) {
            $res['body'] = $this->body;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->outsideBizdomain) {
            $res['outside_bizdomain'] = $this->outsideBizdomain;
        }
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->table) {
            $res['table'] = $this->table;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRmsPluginbytypeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['body'])){
            $model->body = $map['body'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['outside_bizdomain'])){
            $model->outsideBizdomain = $map['outside_bizdomain'];
        }
        if(isset($map['plugin_id'])){
            $model->pluginId = $map['plugin_id'];
        }
        if(isset($map['table'])){
            $model->table = $map['table'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // body
    /**
     * @var string
     */
    public $body;

    // file_id
    /**
     * @var int
     */
    public $fileId;

    // id
    /**
     * @var int
     */
    public $id;

    // outside_bizdomain
    /**
     * @var string
     */
    public $outsideBizdomain;

    // plugin_id
    /**
     * @var int
     */
    public $pluginId;

    // table
    /**
     * @var string
     */
    public $table;

}
