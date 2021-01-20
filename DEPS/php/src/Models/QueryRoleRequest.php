<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryRoleRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'fromAliyun' => 'from_aliyun',
        'pageSize' => 'page_size',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->fromAliyun) {
            $res['from_aliyun'] = $this->fromAliyun;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRoleRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['from_aliyun'])){
            $model->fromAliyun = $map['from_aliyun'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // from_aliyun
    /**
     * @var bool
     */
    public $fromAliyun;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
