<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class BatchDetailVO extends Model
{
    // id
    /**
     * @example 0282t2hs
     *
     * @var string
     */
    public $id;

    // 实施内容id
    /**
     * @example 0282t2hs
     *
     * @var string
     */
    public $combinationId;

    // 批次名称
    /**
     * @example 助学金
     *
     * @var string
     */
    public $name;

    // 备注
    /**
     * @example 50人助学金发放
     *
     * @var string
     */
    public $remarks;

    // 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式】
    /**
     * @example 1
     *
     * @var int
     */
    public $issueWay;

    // 确认接收人 0发前确认 1发后确认
    /**
     * @example 1
     *
     * @var int
     */
    public $affirmanceReceivers;

    // 接收方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3直接导入
    /**
     * @example 1
     *
     * @var int
     */
    public $receiveCheckWay;

    // 发放数量
    /**
     * @example 111
     *
     * @var int
     */
    public $issueAmount;
    protected $_name = [
        'id'                  => 'id',
        'combinationId'       => 'combination_id',
        'name'                => 'name',
        'remarks'             => 'remarks',
        'issueWay'            => 'issue_way',
        'affirmanceReceivers' => 'affirmance_receivers',
        'receiveCheckWay'     => 'receive_check_way',
        'issueAmount'         => 'issue_amount',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('combinationId', $this->combinationId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('remarks', $this->remarks, true);
        Model::validateRequired('issueWay', $this->issueWay, true);
        Model::validateRequired('affirmanceReceivers', $this->affirmanceReceivers, true);
        Model::validateRequired('receiveCheckWay', $this->receiveCheckWay, true);
        Model::validateRequired('issueAmount', $this->issueAmount, true);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->issueWay) {
            $res['issue_way'] = $this->issueWay;
        }
        if (null !== $this->affirmanceReceivers) {
            $res['affirmance_receivers'] = $this->affirmanceReceivers;
        }
        if (null !== $this->receiveCheckWay) {
            $res['receive_check_way'] = $this->receiveCheckWay;
        }
        if (null !== $this->issueAmount) {
            $res['issue_amount'] = $this->issueAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchDetailVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['issue_way'])) {
            $model->issueWay = $map['issue_way'];
        }
        if (isset($map['affirmance_receivers'])) {
            $model->affirmanceReceivers = $map['affirmance_receivers'];
        }
        if (isset($map['receive_check_way'])) {
            $model->receiveCheckWay = $map['receive_check_way'];
        }
        if (isset($map['issue_amount'])) {
            $model->issueAmount = $map['issue_amount'];
        }

        return $model;
    }
}
