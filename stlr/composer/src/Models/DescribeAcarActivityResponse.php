<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DescribeAcarActivityResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 活动主办方名称
    /**
     * @var string
     */
    public $sponsor;

    // 大型活动名称
    /**
     * @var string
     */
    public $activityName;

    // 当前开展的活动主体名称
    /**
     * @var string
     */
    public $enterpriseName;

    // 当前活动主体编码
    /**
     * @var string
     */
    public $enterpriseNo;

    // 当前主体活动开始日期
    /**
     * @var string
     */
    public $enterpriseStartDate;

    // 当前主体活动结束日期
    /**
     * @var string
     */
    public $enterpriseEndDate;

    // 当前活动是否已经经过碳排放认证
    /**
     * @var bool
     */
    public $authed;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'sponsor'             => 'sponsor',
        'activityName'        => 'activity_name',
        'enterpriseName'      => 'enterprise_name',
        'enterpriseNo'        => 'enterprise_no',
        'enterpriseStartDate' => 'enterprise_start_date',
        'enterpriseEndDate'   => 'enterprise_end_date',
        'authed'              => 'authed',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->sponsor) {
            $res['sponsor'] = $this->sponsor;
        }
        if (null !== $this->activityName) {
            $res['activity_name'] = $this->activityName;
        }
        if (null !== $this->enterpriseName) {
            $res['enterprise_name'] = $this->enterpriseName;
        }
        if (null !== $this->enterpriseNo) {
            $res['enterprise_no'] = $this->enterpriseNo;
        }
        if (null !== $this->enterpriseStartDate) {
            $res['enterprise_start_date'] = $this->enterpriseStartDate;
        }
        if (null !== $this->enterpriseEndDate) {
            $res['enterprise_end_date'] = $this->enterpriseEndDate;
        }
        if (null !== $this->authed) {
            $res['authed'] = $this->authed;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DescribeAcarActivityResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['sponsor'])) {
            $model->sponsor = $map['sponsor'];
        }
        if (isset($map['activity_name'])) {
            $model->activityName = $map['activity_name'];
        }
        if (isset($map['enterprise_name'])) {
            $model->enterpriseName = $map['enterprise_name'];
        }
        if (isset($map['enterprise_no'])) {
            $model->enterpriseNo = $map['enterprise_no'];
        }
        if (isset($map['enterprise_start_date'])) {
            $model->enterpriseStartDate = $map['enterprise_start_date'];
        }
        if (isset($map['enterprise_end_date'])) {
            $model->enterpriseEndDate = $map['enterprise_end_date'];
        }
        if (isset($map['authed'])) {
            $model->authed = $map['authed'];
        }

        return $model;
    }
}
