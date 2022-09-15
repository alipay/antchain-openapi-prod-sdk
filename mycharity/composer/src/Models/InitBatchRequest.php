<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class InitBatchRequest extends Model
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

    // id
    /**
     * @var string
     */
    public $id;

    // 实施内容id
    /**
     * @var string
     */
    public $combinationId;

    // 批次名称
    /**
     * @var string
     */
    public $name;

    // 发放备注
    /**
     * @var string
     */
    public $remarks;

    // 确认接收人 0发前确认 1发后确认
    /**
     * @var int
     */
    public $affirmanceReceivers;

    // 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式，6：现场组织】
    /**
     * @var int
     */
    public $issueWay;

    // 接收验证方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3快递签收验证，4登录确认，5直接导入）
    /**
     * @var int
     */
    public $receiveCheckWay;

    // 分期ID
    /**
     * @var string
     */
    public $stagesId;

    // 发放数量最大值1亿（发后确认- 扫码领取时必填）单位分
    /**
     * @var int
     */
    public $issueAmount;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'id'                  => 'id',
        'combinationId'       => 'combination_id',
        'name'                => 'name',
        'remarks'             => 'remarks',
        'affirmanceReceivers' => 'affirmance_receivers',
        'issueWay'            => 'issue_way',
        'receiveCheckWay'     => 'receive_check_way',
        'stagesId'            => 'stages_id',
        'issueAmount'         => 'issue_amount',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('combinationId', $this->combinationId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('remarks', $this->remarks, true);
        Model::validateRequired('affirmanceReceivers', $this->affirmanceReceivers, true);
        Model::validateRequired('issueWay', $this->issueWay, true);
        Model::validateRequired('receiveCheckWay', $this->receiveCheckWay, true);
        Model::validateRequired('stagesId', $this->stagesId, true);
        Model::validateMaxLength('id', $this->id, 50);
        Model::validateMaxLength('combinationId', $this->combinationId, 50);
        Model::validateMaxLength('name', $this->name, 100);
        Model::validateMaxLength('remarks', $this->remarks, 200);
        Model::validateMaxLength('stagesId', $this->stagesId, 50);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->combinationId) {
            $res['combination_id'] = $this->combinationId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->remarks) {
            $res['remarks'] = $this->remarks;
        }
        if (null !== $this->affirmanceReceivers) {
            $res['affirmance_receivers'] = $this->affirmanceReceivers;
        }
        if (null !== $this->issueWay) {
            $res['issue_way'] = $this->issueWay;
        }
        if (null !== $this->receiveCheckWay) {
            $res['receive_check_way'] = $this->receiveCheckWay;
        }
        if (null !== $this->stagesId) {
            $res['stages_id'] = $this->stagesId;
        }
        if (null !== $this->issueAmount) {
            $res['issue_amount'] = $this->issueAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitBatchRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['combination_id'])) {
            $model->combinationId = $map['combination_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['remarks'])) {
            $model->remarks = $map['remarks'];
        }
        if (isset($map['affirmance_receivers'])) {
            $model->affirmanceReceivers = $map['affirmance_receivers'];
        }
        if (isset($map['issue_way'])) {
            $model->issueWay = $map['issue_way'];
        }
        if (isset($map['receive_check_way'])) {
            $model->receiveCheckWay = $map['receive_check_way'];
        }
        if (isset($map['stages_id'])) {
            $model->stagesId = $map['stages_id'];
        }
        if (isset($map['issue_amount'])) {
            $model->issueAmount = $map['issue_amount'];
        }

        return $model;
    }
}
