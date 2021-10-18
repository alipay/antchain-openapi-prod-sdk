<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_IOT\Models;

use AlibabaCloud\Tea\Model;

class SendCollectorBychainidRequest extends Model
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

    // 设备链id
    /**
     * @var string
     */
    public $chainDeviceId;

    // [{"name","1"},{"name","1"}]
    /**
     * @var CollectContent[]
     */
    public $collectContentList;

    // 随机数，防重放
    //
    /**
     * @var string
     */
    public $nonce;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'chainDeviceId'      => 'chain_device_id',
        'collectContentList' => 'collect_content_list',
        'nonce'              => 'nonce',
    ];

    public function validate()
    {
        Model::validateRequired('chainDeviceId', $this->chainDeviceId, true);
        Model::validateRequired('collectContentList', $this->collectContentList, true);
        Model::validateRequired('nonce', $this->nonce, true);
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
        if (null !== $this->chainDeviceId) {
            $res['chain_device_id'] = $this->chainDeviceId;
        }
        if (null !== $this->collectContentList) {
            $res['collect_content_list'] = [];
            if (null !== $this->collectContentList && \is_array($this->collectContentList)) {
                $n = 0;
                foreach ($this->collectContentList as $item) {
                    $res['collect_content_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendCollectorBychainidRequest
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
        if (isset($map['chain_device_id'])) {
            $model->chainDeviceId = $map['chain_device_id'];
        }
        if (isset($map['collect_content_list'])) {
            if (!empty($map['collect_content_list'])) {
                $model->collectContentList = [];
                $n                         = 0;
                foreach ($map['collect_content_list'] as $item) {
                    $model->collectContentList[$n++] = null !== $item ? CollectContent::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }

        return $model;
    }
}
