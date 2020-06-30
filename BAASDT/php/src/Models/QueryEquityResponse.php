<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryEquityResponse extends Model {
    protected $_name = [
        'equity' => 'equity',
        'urls' => 'urls',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->equity) {
            $res['equity'] = null !== $this->equity ? $this->equity->toMap() : null;
        }
        if (null !== $this->urls) {
            $res['urls'] = [];
            if(null !== $this->urls){
                $res['urls'] = $this->urls;
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryEquityResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['equity'])){
            $model->equity = Equity::fromMap($map['equity']);
        }
        if(isset($map['urls'])){
            if(!empty($map['urls'])){
                $model->urls = [];
                $model->urls = $map['urls'];
            }
        }
        return $model;
    }
    /**
     * @description 权益商品完整信息: equityType 权益类型：0积分，1卡券，2实物。 status 权益状态：0可用状态，1下线，2冻结。 authType 权益授权类型：0自动，1合约。
 { "equity_id": "6041f851f4d", "tenant_id": "ZEJEZKUA", "admin_id": "ed7b3ac3c061", "equity_type": 1, "equity_name": "FDCardtest", "description": "FDCard", "total_count": "1000000", "status": 0, "auth_type": 0, "currency": "CNY", "value": "10.0000", "default_price": "1.0000", "images": "oss://myexchange/12593acf32dd6d4257fa0.jpeg", "desc_images": "", "memo": "", "is_public": true, "valid_not_before": 112692, "valid_not_after": 112654365244, "use_valid_not_before": 112612, "use_valid_not_after": 11265436524415235, "limit_per_user_and_day": 1000000, "limit_per_user_and_month": 100000, "limit_per_merchant_and_day": 1000000, "limit_per_merchant_and_month": 1000000, "equity_ext_info": { "open_to_tenant_id": "", "tenant_price": "", "tenant_user_price": { "snapshot_tenant_price": "", "user_price_type": 0, "price": "", "ratio": "" }, "target_date": "", "limit_per_day_used": 0, "limit_per_month_used": 0 } }
     * @example 
     * @var Equity
     */
    public $equity;

    /**
     * @description 权益图片的永久oss地址
     * @example [oss1, oss2, oss3]
     * @var array
     */
    public $urls;

}
