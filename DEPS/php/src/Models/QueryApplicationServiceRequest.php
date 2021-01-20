<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationServiceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'applicationName' => 'application_name',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'workspaces' => 'workspaces',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = $this->workspaces;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryApplicationServiceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['workspaces'])){
            if(!empty($map['workspaces'])){
                $model->workspaces = $map['workspaces'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 待查询的应用名称。最大60个UTF-8字符
    /**
     * @var string
     */
    public $applicationName;

    // 当前页码，默认为1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认10，最大50
    /**
     * @var int
     */
    public $pageSize;

    // 目标环境名称
    /**
     * @var string[]
     */
    public $workspaces;

}
