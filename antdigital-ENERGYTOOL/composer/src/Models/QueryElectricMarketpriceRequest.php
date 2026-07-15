<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryElectricMarketpriceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'marketCode' => 'market_code',
        'queryTypeList' => 'query_type_list',
        'queryDateStart' => 'query_date_start',
        'queryDateEnd' => 'query_date_end',
        'queryDateList' => 'query_date_list',
        'periodStart' => 'period_start',
        'periodEnd' => 'period_end',
    ];
    public function validate() {
        Model::validateRequired('marketCode', $this->marketCode, true);
        Model::validateRequired('queryTypeList', $this->queryTypeList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->marketCode) {
            $res['market_code'] = $this->marketCode;
        }
        if (null !== $this->queryTypeList) {
            $res['query_type_list'] = $this->queryTypeList;
        }
        if (null !== $this->queryDateStart) {
            $res['query_date_start'] = $this->queryDateStart;
        }
        if (null !== $this->queryDateEnd) {
            $res['query_date_end'] = $this->queryDateEnd;
        }
        if (null !== $this->queryDateList) {
            $res['query_date_list'] = $this->queryDateList;
        }
        if (null !== $this->periodStart) {
            $res['period_start'] = $this->periodStart;
        }
        if (null !== $this->periodEnd) {
            $res['period_end'] = $this->periodEnd;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryElectricMarketpriceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['market_code'])){
            $model->marketCode = $map['market_code'];
        }
        if(isset($map['query_type_list'])){
            if(!empty($map['query_type_list'])){
                $model->queryTypeList = $map['query_type_list'];
            }
        }
        if(isset($map['query_date_start'])){
            $model->queryDateStart = $map['query_date_start'];
        }
        if(isset($map['query_date_end'])){
            $model->queryDateEnd = $map['query_date_end'];
        }
        if(isset($map['query_date_list'])){
            if(!empty($map['query_date_list'])){
                $model->queryDateList = $map['query_date_list'];
            }
        }
        if(isset($map['period_start'])){
            $model->periodStart = $map['period_start'];
        }
        if(isset($map['period_end'])){
            $model->periodEnd = $map['period_end'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 市场码
    /**
     * @var string
     */
    public $marketCode;

    // 查询类型:DAY_AHEAD 日前预测 / REALTIME 实时,可单传或都传
    /**
     * @var string[]
     */
    public $queryTypeList;

    // 查询日期起始,格式 yyyy-MM-dd,与 query_date_end 配套闭区间,最多7天,与 query_date_list 二选一
    /**
     * @var string
     */
    public $queryDateStart;

    // 查询日期结束,格式 yyyy-MM-dd,与 query_date_start 配套闭区间,最多7天,与 query_date_list 二选一
    /**
     * @var string
     */
    public $queryDateEnd;

    // 查询日期列表,格式 yyyy-MM-dd,与 start/end 二选一,最多7个
    /**
     * @var string[]
     */
    public $queryDateList;

    // 时点起始,1~96 整数,不传默认1
    /**
     * @var int
     */
    public $periodStart;

    // 时点结束,1~96 整数,不传默认96
    /**
     * @var int
     */
    public $periodEnd;

}
