<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCutpaymentsubTransactionRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 二级商户账户号
    /**
     * @var string
     */
    public $contractNo;

    // 明细开始时间，格式为：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $startTime;

    // 明细结束时间，格式为：yyyy-MM-dd HH:mm:ss，查询间隔最大支持一个月
    /**
     * @var string
     */
    public $endTime;

    // 当前页
    /**
     * @var string
     */
    public $pageNum;

    // 每页数量，每页最多100条数据
    /**
     * @var string
     */
    public $pageSize;

    // 一级商户商户号
    /**
     * @var string
     */
    public $firstLevelMemberid;

    // 一级商户终端号
    /**
     * @var string
     */
    public $firstLevelTerminalid;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'outerOrderNo'         => 'outer_order_no',
        'contractNo'           => 'contract_no',
        'startTime'            => 'start_time',
        'endTime'              => 'end_time',
        'pageNum'              => 'page_num',
        'pageSize'             => 'page_size',
        'firstLevelMemberid'   => 'first_level_memberid',
        'firstLevelTerminalid' => 'first_level_terminalid',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('contractNo', $this->contractNo, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('firstLevelMemberid', $this->firstLevelMemberid, true);
        Model::validateRequired('firstLevelTerminalid', $this->firstLevelTerminalid, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->firstLevelMemberid) {
            $res['first_level_memberid'] = $this->firstLevelMemberid;
        }
        if (null !== $this->firstLevelTerminalid) {
            $res['first_level_terminalid'] = $this->firstLevelTerminalid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCutpaymentsubTransactionRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['first_level_memberid'])) {
            $model->firstLevelMemberid = $map['first_level_memberid'];
        }
        if (isset($map['first_level_terminalid'])) {
            $model->firstLevelTerminalid = $map['first_level_terminalid'];
        }

        return $model;
    }
}
