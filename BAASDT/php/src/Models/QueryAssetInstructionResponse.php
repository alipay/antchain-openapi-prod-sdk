<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAssetInstructionResponse extends Model {
    protected $_name = [
        'instruction' => 'instruction',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->instruction) {
            $res['instruction'] = $this->instruction;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAssetInstructionResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['instruction'])){
            $model->instruction = $map['instruction'];
        }
        return $model;
    }
    /**
     * @description 资产流水完整信息的json字符串。
direction 交易方向:：0正向交易，1反向交易。
type 交易类型：0 资产发行；1资产赎回；2资产发放；3资产发放回退；4资产风控调整；5资产过期；6资产支付；7资产支付退款。
status流水状态(Complete)；0完成
     * @example {"outBizID":"111","tenantID":"Bjhv32bjcab","assetID":"asset","assetIssuerID":"f79097436240ea1fef9728","direction":0,"type":0,"timeStamp":1581347704,"originalOutBizID":"110","fromID":"aaa","toID":"ccc","amount":"1","remainAmount":"2","status":0}
     * @var string
     */
    public $instruction;

}
