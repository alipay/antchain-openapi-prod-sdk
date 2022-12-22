<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class QueryCodeRegistrationRequest extends Model
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

    // 业务类型，客户自定义标签，做code数据隔离使用
    //
    /**
     * @var string
     */
    public $bizType;

    // 溯源码，代表该账户的唯一资源标识
    /**
     * @var string
     */
    public $code;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
    /**
     * @var string[]
     */
    public $bizLabels;

    // 注册记录唯一标识
    /**
     * @var string
     */
    public $uniqueId;

    // 状态,客户自定义状态，用于过滤查询使用。
    // 状态信息只能由字母+数字构成，多个状态可以用"|"分隔
    /**
     * @var string
     */
    public $status;

    // 仅能取如下值范围：
    // 1. ASC     按注册时间升序
    // 2. DESC   按注册时间降序
    // 默认降序
    /**
     * @var string
     */
    public $sortType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizType'           => 'biz_type',
        'code'              => 'code',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'bizLabels'         => 'biz_labels',
        'uniqueId'          => 'unique_id',
        'status'            => 'status',
        'sortType'          => 'sort_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateMaxLength('bizType', $this->bizType, 32);
        Model::validateMaxLength('code', $this->code, 160);
        Model::validateMaxLength('uniqueId', $this->uniqueId, 64);
        Model::validateMaxLength('status', $this->status, 256);
        Model::validateMinLength('bizType', $this->bizType, 1);
        Model::validateMinLength('code', $this->code, 1);
        Model::validateMinLength('uniqueId', $this->uniqueId, 1);
        Model::validateMinLength('status', $this->status, 1);
        Model::validateMinimum('pageNum', $this->pageNum, 1);
        Model::validateMaximum('pageSize', $this->pageSize, 200);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->bizLabels) {
            $res['biz_labels'] = $this->bizLabels;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->sortType) {
            $res['sort_type'] = $this->sortType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCodeRegistrationRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['biz_labels'])) {
            if (!empty($map['biz_labels'])) {
                $model->bizLabels = $map['biz_labels'];
            }
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sort_type'])) {
            $model->sortType = $map['sort_type'];
        }

        return $model;
    }
}
