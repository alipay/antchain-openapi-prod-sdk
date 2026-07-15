<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryAheadrealtimePricecompareRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'runDate' => 'run_date',
        'province' => 'province',
    ];
    public function validate() {
        Model::validateRequired('runDate', $this->runDate, true);
        Model::validateRequired('province', $this->province, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->runDate) {
            $res['run_date'] = $this->runDate;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAheadrealtimePricecompareRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['run_date'])){
            $model->runDate = $map['run_date'];
        }
        if(isset($map['province'])){
            $model->province = $map['province'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 运行日，格式：yyyy-mm-dd
    /**
     * @var string
     */
    public $runDate;

    // 省地区编码，目前仅支持江苏省
    /**
     * @var string
     */
    public $province;

}
