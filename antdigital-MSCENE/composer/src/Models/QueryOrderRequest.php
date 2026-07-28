<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MSCENE\Models;

use AlibabaCloud\Tea\Model;

class QueryOrderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'miniProgramId' => 'mini_program_id',
        'platformId' => 'platform_id',
        'customId' => 'custom_id',
    ];
    public function validate() {
        Model::validateRequired('miniProgramId', $this->miniProgramId, true);
        Model::validateRequired('platformId', $this->platformId, true);
        Model::validateRequired('customId', $this->customId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->miniProgramId) {
            $res['mini_program_id'] = $this->miniProgramId;
        }
        if (null !== $this->platformId) {
            $res['platform_id'] = $this->platformId;
        }
        if (null !== $this->customId) {
            $res['custom_id'] = $this->customId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOrderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['mini_program_id'])){
            $model->miniProgramId = $map['mini_program_id'];
        }
        if(isset($map['platform_id'])){
            $model->platformId = $map['platform_id'];
        }
        if(isset($map['custom_id'])){
            $model->customId = $map['custom_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 小游戏ID
    /**
     * @var string
     */
    public $miniProgramId;

    // 平台ID
    /**
     * @var string
     */
    public $platformId;

    // 客户订单号
    /**
     * @var string
     */
    public $customId;

}
