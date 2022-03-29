<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAlarmwebhookRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // createOrModifyByMe
    /**
     * @var bool
     */
    public $createOrModifyByMe;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // webhook名称
    /**
     * @var string
     */
    public $name;

    // 修改人
    /**
     * @var string
     */
    public $modifier;

    // ID列表
    /**
     * @var int[]
     */
    public $ids;

    // 是否只查询当前操作者的
    /**
     * @var bool
     */
    public $onlyCurrentStaff;
    protected $_name = [
        'authToken'          => 'auth_token',
        'workspaceName'      => 'workspace_name',
        'createOrModifyByMe' => 'create_or_modify_by_me',
        'currentPage'        => 'current_page',
        'pageSize'           => 'page_size',
        'name'               => 'name',
        'modifier'           => 'modifier',
        'ids'                => 'ids',
        'onlyCurrentStaff'   => 'only_current_staff',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('createOrModifyByMe', $this->createOrModifyByMe, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->createOrModifyByMe) {
            $res['create_or_modify_by_me'] = $this->createOrModifyByMe;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }
        if (null !== $this->onlyCurrentStaff) {
            $res['only_current_staff'] = $this->onlyCurrentStaff;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAlarmwebhookRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['create_or_modify_by_me'])) {
            $model->createOrModifyByMe = $map['create_or_modify_by_me'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
            }
        }
        if (isset($map['only_current_staff'])) {
            $model->onlyCurrentStaff = $map['only_current_staff'];
        }

        return $model;
    }
}
