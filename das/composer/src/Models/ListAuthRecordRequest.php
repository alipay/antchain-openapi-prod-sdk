<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class ListAuthRecordRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 数据源可信空间id
    /**
     * @var string
     */
    public $sourceServiceNodeId;

    // 数据源租户id
    /**
     * @var string
     */
    public $sourceTenantId;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 用户信息
    /**
     * @var string
     */
    public $userInfo;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'sourceServiceNodeId' => 'source_service_node_id',
        'sourceTenantId'      => 'source_tenant_id',
        'sceneCode'           => 'scene_code',
        'userInfo'            => 'user_info',
        'pageNum'             => 'page_num',
        'pageSize'            => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('sourceServiceNodeId', $this->sourceServiceNodeId, true);
        Model::validateRequired('sourceTenantId', $this->sourceTenantId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->sourceServiceNodeId) {
            $res['source_service_node_id'] = $this->sourceServiceNodeId;
        }
        if (null !== $this->sourceTenantId) {
            $res['source_tenant_id'] = $this->sourceTenantId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = $this->userInfo;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAuthRecordRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['source_service_node_id'])) {
            $model->sourceServiceNodeId = $map['source_service_node_id'];
        }
        if (isset($map['source_tenant_id'])) {
            $model->sourceTenantId = $map['source_tenant_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = $map['user_info'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
