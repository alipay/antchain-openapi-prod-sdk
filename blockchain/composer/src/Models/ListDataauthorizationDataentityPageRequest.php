<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListDataauthorizationDataentityPageRequest extends Model
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

    // 授权状态
    /**
     * @var string
     */
    public $authStatus;

    // 模型名称
    /**
     * @var string
     */
    public $modelName;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;

    // 参与方DID
    /**
     * @var string
     */
    public $participantId;

    // 数据模型业务ID
    /**
     * @var string
     */
    public $modelBizId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authStatus'        => 'auth_status',
        'modelName'         => 'model_name',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'participantId'     => 'participant_id',
        'modelBizId'        => 'model_biz_id',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('participantId', $this->participantId, true);
        Model::validateMinimum('pageNum', $this->pageNum, 1);
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
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->participantId) {
            $res['participant_id'] = $this->participantId;
        }
        if (null !== $this->modelBizId) {
            $res['model_biz_id'] = $this->modelBizId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDataauthorizationDataentityPageRequest
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
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['model_name'])) {
            $model->modelName = $map['model_name'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['participant_id'])) {
            $model->participantId = $map['participant_id'];
        }
        if (isset($map['model_biz_id'])) {
            $model->modelBizId = $map['model_biz_id'];
        }

        return $model;
    }
}
