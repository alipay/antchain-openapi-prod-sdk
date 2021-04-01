<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListDataauthorizationDatamodelPageRequest extends Model
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

    // 模型业务ID
    /**
     * @var string
     */
    public $modelBizId;

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

    // 空间ID
    /**
     * @var string
     */
    public $spaceId;

    // 提交人名字
    /**
     * @var string
     */
    public $submitterName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'modelBizId'        => 'model_biz_id',
        'modelName'         => 'model_name',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'spaceId'           => 'space_id',
        'submitterName'     => 'submitter_name',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('spaceId', $this->spaceId, true);
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
        if (null !== $this->modelBizId) {
            $res['model_biz_id'] = $this->modelBizId;
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
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }
        if (null !== $this->submitterName) {
            $res['submitter_name'] = $this->submitterName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDataauthorizationDatamodelPageRequest
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
        if (isset($map['model_biz_id'])) {
            $model->modelBizId = $map['model_biz_id'];
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
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['submitter_name'])) {
            $model->submitterName = $map['submitter_name'];
        }

        return $model;
    }
}
