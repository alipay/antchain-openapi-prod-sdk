<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'applicationName' => 'application_name',
        'appGroupName' => 'app_group_name',
        'appLevelName' => 'app_level_name',
        'ownerLoginName' => 'owner_login_name',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'queryExtraInfo' => 'query_extra_info',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->appGroupName) {
            $res['app_group_name'] = $this->appGroupName;
        }
        if (null !== $this->appLevelName) {
            $res['app_level_name'] = $this->appLevelName;
        }
        if (null !== $this->ownerLoginName) {
            $res['owner_login_name'] = $this->ownerLoginName;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->queryExtraInfo) {
            $res['query_extra_info'] = $this->queryExtraInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryApplicationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['app_group_name'])){
            $model->appGroupName = $map['app_group_name'];
        }
        if(isset($map['app_level_name'])){
            $model->appLevelName = $map['app_level_name'];
        }
        if(isset($map['owner_login_name'])){
            $model->ownerLoginName = $map['owner_login_name'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['query_extra_info'])){
            $model->queryExtraInfo = $map['query_extra_info'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 应用名称
    /**
     * @var string
     */
    public $applicationName;

    // 应用分组名
    /**
     * @var string
     */
    public $appGroupName;

    // 应用级别
    /**
     * @var string
     */
    public $appLevelName;

    // 登录名
    /**
     * @var string
     */
    public $ownerLoginName;

    // 当前页码，默认为1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认10
    /**
     * @var int
     */
    public $pageSize;

    // 查询结果是否返回应用额外元数据信息。此字段为 true 时，为保证查询效率，列表大小将强制修改为 10 （若超过）
    /**
     * @var bool
     */
    public $queryExtraInfo;

}
