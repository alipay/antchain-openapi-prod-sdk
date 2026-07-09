<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SendLabelTransferrawonasyncRequest extends Model
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

    // 场景码
    //
    /**
     * @var string
     */
    public $scene;

    // 收集的标签流转数据
    /**
     * @var CollectLabelRawContent[]
     */
    public $collectLabelRawContentList;

    // 业务号，防重放
    /**
     * @var string
     */
    public $nonce;

    // 1 业务端查询结果的最晚时间 2 单位：天，最大值为30 天 3 在responsePeriod 天之后，调用异步接口结果查询 将 无法获取异步接口的执行结果
    /**
     * @var int
     */
    public $responsePeriod;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'scene'                      => 'scene',
        'collectLabelRawContentList' => 'collect_label_raw_content_list',
        'nonce'                      => 'nonce',
        'responsePeriod'             => 'response_period',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('collectLabelRawContentList', $this->collectLabelRawContentList, true);
        Model::validateRequired('nonce', $this->nonce, true);
        Model::validateRequired('responsePeriod', $this->responsePeriod, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->collectLabelRawContentList) {
            $res['collect_label_raw_content_list'] = [];
            if (null !== $this->collectLabelRawContentList && \is_array($this->collectLabelRawContentList)) {
                $n = 0;
                foreach ($this->collectLabelRawContentList as $item) {
                    $res['collect_label_raw_content_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->responsePeriod) {
            $res['response_period'] = $this->responsePeriod;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendLabelTransferrawonasyncRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['collect_label_raw_content_list'])) {
            if (!empty($map['collect_label_raw_content_list'])) {
                $model->collectLabelRawContentList = [];
                $n                                 = 0;
                foreach ($map['collect_label_raw_content_list'] as $item) {
                    $model->collectLabelRawContentList[$n++] = null !== $item ? CollectLabelRawContent::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['response_period'])) {
            $model->responsePeriod = $map['response_period'];
        }

        return $model;
    }
}
