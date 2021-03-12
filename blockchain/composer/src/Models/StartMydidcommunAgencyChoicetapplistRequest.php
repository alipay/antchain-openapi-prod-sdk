<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunAgencyChoicetapplistRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 入驻时候生成的did
    /**
     * @var string
     */
    public $did;

    // 选择的tapp信息列表
    /**
     * @var ChoiceTappInfo[]
     */
    public $tappInfos;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'tappInfos'         => 'tapp_infos',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('tappInfos', $this->tappInfos, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->tappInfos) {
            $res['tapp_infos'] = [];
            if (null !== $this->tappInfos && \is_array($this->tappInfos)) {
                $n = 0;
                foreach ($this->tappInfos as $item) {
                    $res['tapp_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidcommunAgencyChoicetapplistRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['tapp_infos'])) {
            if (!empty($map['tapp_infos'])) {
                $model->tappInfos = [];
                $n                = 0;
                foreach ($map['tapp_infos'] as $item) {
                    $model->tappInfos[$n++] = null !== $item ? ChoiceTappInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
