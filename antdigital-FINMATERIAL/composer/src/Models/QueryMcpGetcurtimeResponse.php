<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryMcpGetcurtimeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'datetime' => 'datetime',
        'weekDay' => 'week_day',
        'ifTradingDay' => 'if_trading_day',
        'ifWeekEnd' => 'if_week_end',
        'ifMonthEnd' => 'if_month_end',
        'ifQuarterEnd' => 'if_quarter_end',
        'ifYearEnd' => 'if_year_end',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->datetime) {
            $res['datetime'] = $this->datetime;
        }
        if (null !== $this->weekDay) {
            $res['week_day'] = $this->weekDay;
        }
        if (null !== $this->ifTradingDay) {
            $res['if_trading_day'] = $this->ifTradingDay;
        }
        if (null !== $this->ifWeekEnd) {
            $res['if_week_end'] = $this->ifWeekEnd;
        }
        if (null !== $this->ifMonthEnd) {
            $res['if_month_end'] = $this->ifMonthEnd;
        }
        if (null !== $this->ifQuarterEnd) {
            $res['if_quarter_end'] = $this->ifQuarterEnd;
        }
        if (null !== $this->ifYearEnd) {
            $res['if_year_end'] = $this->ifYearEnd;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMcpGetcurtimeResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['datetime'])){
            $model->datetime = $map['datetime'];
        }
        if(isset($map['week_day'])){
            $model->weekDay = $map['week_day'];
        }
        if(isset($map['if_trading_day'])){
            $model->ifTradingDay = $map['if_trading_day'];
        }
        if(isset($map['if_week_end'])){
            $model->ifWeekEnd = $map['if_week_end'];
        }
        if(isset($map['if_month_end'])){
            $model->ifMonthEnd = $map['if_month_end'];
        }
        if(isset($map['if_quarter_end'])){
            $model->ifQuarterEnd = $map['if_quarter_end'];
        }
        if(isset($map['if_year_end'])){
            $model->ifYearEnd = $map['if_year_end'];
        }
        return $model;
    }
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

    // 当前日期时间
    /**
     * @var string
     */
    public $datetime;

    // 周几
    /**
     * @var string
     */
    public $weekDay;

    // 是否交易日
    /**
     * @var string
     */
    public $ifTradingDay;

    // 是否周最后交易日
    /**
     * @var string
     */
    public $ifWeekEnd;

    // 是否月最后交易日
    /**
     * @var string
     */
    public $ifMonthEnd;

    // 是否季最后交易日
    /**
     * @var string
     */
    public $ifQuarterEnd;

    // 是否年最后交易日
    /**
     * @var string
     */
    public $ifYearEnd;

}
