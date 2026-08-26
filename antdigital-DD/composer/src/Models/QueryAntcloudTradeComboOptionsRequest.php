<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudTradeComboOptionsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'vid' => 'vid',
        'ou' => 'ou',
        'tenantId' => 'tenant_id',
        'marketType' => 'market_type',
    ];
    public function validate() {
        Model::validateRequired('vid', $this->vid, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->vid) {
            $res['vid'] = $this->vid;
        }
        if (null !== $this->ou) {
            $res['ou'] = $this->ou;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->marketType) {
            $res['market_type'] = $this->marketType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudTradeComboOptionsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['vid'])){
            $model->vid = $map['vid'];
        }
        if(isset($map['ou'])){
            $model->ou = $map['ou'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['market_type'])){
            $model->marketType = $map['market_type'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 套餐版本唯一版本号，有值则优先使用
    /**
     * @var string
     */
    public $vid;

    // 销售主体（如ZL6、ZL7）
    /**
     * @var string
     */
    public $ou;

    // 购买租户id
    /**
     * @var string
     */
    public $tenantId;

    // 售卖市场
    /**
     * @var string
     */
    public $marketType;

}
