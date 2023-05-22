<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class ListEcarOffsetdatumRequest extends Model
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

    // 碳补偿项目编码
    /**
     * @var string
     */
    public $projectNo;

    // 账户DID
    /**
     * @var string
     */
    public $accountDid;

    // 发生开始时间
    /**
     * @var string
     */
    public $occurrentStartTime;

    // 数据发生截止时间
    /**
     * @var string
     */
    public $occurrentEndTime;

    // 碳普惠平台编码
    /**
     * @var string
     */
    public $carbonOffsetPlatformNo;

    // 发生场景编码，需指定相关碳普惠平台的场景编码，可以指定多个场景
    /**
     * @var string[]
     */
    public $scenarioCode;

    // 分页查询数据时的页码，从1开始，不传入时默认值为1
    /**
     * @var int
     */
    public $current;

    // 每页数据量，默认值为20，取值范围为[10,100]
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'projectNo'              => 'project_no',
        'accountDid'             => 'account_did',
        'occurrentStartTime'     => 'occurrent_start_time',
        'occurrentEndTime'       => 'occurrent_end_time',
        'carbonOffsetPlatformNo' => 'carbon_offset_platform_no',
        'scenarioCode'           => 'scenario_code',
        'current'                => 'current',
        'pageSize'               => 'page_size',
    ];

    public function validate()
    {
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
        if (null !== $this->projectNo) {
            $res['project_no'] = $this->projectNo;
        }
        if (null !== $this->accountDid) {
            $res['account_did'] = $this->accountDid;
        }
        if (null !== $this->occurrentStartTime) {
            $res['occurrent_start_time'] = $this->occurrentStartTime;
        }
        if (null !== $this->occurrentEndTime) {
            $res['occurrent_end_time'] = $this->occurrentEndTime;
        }
        if (null !== $this->carbonOffsetPlatformNo) {
            $res['carbon_offset_platform_no'] = $this->carbonOffsetPlatformNo;
        }
        if (null !== $this->scenarioCode) {
            $res['scenario_code'] = $this->scenarioCode;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListEcarOffsetdatumRequest
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
        if (isset($map['project_no'])) {
            $model->projectNo = $map['project_no'];
        }
        if (isset($map['account_did'])) {
            $model->accountDid = $map['account_did'];
        }
        if (isset($map['occurrent_start_time'])) {
            $model->occurrentStartTime = $map['occurrent_start_time'];
        }
        if (isset($map['occurrent_end_time'])) {
            $model->occurrentEndTime = $map['occurrent_end_time'];
        }
        if (isset($map['carbon_offset_platform_no'])) {
            $model->carbonOffsetPlatformNo = $map['carbon_offset_platform_no'];
        }
        if (isset($map['scenario_code'])) {
            if (!empty($map['scenario_code'])) {
                $model->scenarioCode = $map['scenario_code'];
            }
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
