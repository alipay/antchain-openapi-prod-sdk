<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class DeleteHealthContactRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contanctId' => 'contanct_id',
        'channelId' => 'channel_id',
    ];
    public function validate() {
        Model::validateRequired('contanctId', $this->contanctId, true);
        Model::validateRequired('channelId', $this->channelId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->contanctId) {
            $res['contanct_id'] = $this->contanctId;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteHealthContactRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['contanct_id'])){
            $model->contanctId = $map['contanct_id'];
        }
        if(isset($map['channel_id'])){
            $model->channelId = $map['channel_id'];
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

    // 联系人业务id
    /**
     * @var string
     */
    public $contanctId;

    // 品牌方渠道标识
    /**
     * @var string
     */
    public $channelId;

}
