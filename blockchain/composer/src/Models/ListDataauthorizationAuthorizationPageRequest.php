<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListDataauthorizationAuthorizationPageRequest extends Model
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

    // 授权时间终点
    /**
     * @var int
     */
    public $endTime;

    // 授权人ID
    /**
     * @var string
     */
    public $issuerId;

    // 授权人名字
    /**
     * @var string
     */
    public $issuerName;

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

    // 授权时间起点
    /**
     * @var int
     */
    public $startIme;

    // 被授权人ID
    /**
     * @var string
     */
    public $subjectId;

    // 被授权人名字
    /**
     * @var string
     */
    public $subjectName;

    // 数据资产ID
    /**
     * @var string
     */
    public $dataId;

    // 数据模型ID
    /**
     * @var string
     */
    public $dataModelId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'endTime'           => 'end_time',
        'issuerId'          => 'issuer_id',
        'issuerName'        => 'issuer_name',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'spaceId'           => 'space_id',
        'startIme'          => 'start_ime',
        'subjectId'         => 'subject_id',
        'subjectName'       => 'subject_name',
        'dataId'            => 'data_id',
        'dataModelId'       => 'data_model_id',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('spaceId', $this->spaceId, true);
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
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->issuerId) {
            $res['issuer_id'] = $this->issuerId;
        }
        if (null !== $this->issuerName) {
            $res['issuer_name'] = $this->issuerName;
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
        if (null !== $this->startIme) {
            $res['start_ime'] = $this->startIme;
        }
        if (null !== $this->subjectId) {
            $res['subject_id'] = $this->subjectId;
        }
        if (null !== $this->subjectName) {
            $res['subject_name'] = $this->subjectName;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDataauthorizationAuthorizationPageRequest
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
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['issuer_id'])) {
            $model->issuerId = $map['issuer_id'];
        }
        if (isset($map['issuer_name'])) {
            $model->issuerName = $map['issuer_name'];
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
        if (isset($map['start_ime'])) {
            $model->startIme = $map['start_ime'];
        }
        if (isset($map['subject_id'])) {
            $model->subjectId = $map['subject_id'];
        }
        if (isset($map['subject_name'])) {
            $model->subjectName = $map['subject_name'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }

        return $model;
    }
}
