<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class ContractSignResponse extends Model
{
    // 流程id
    /**
     * @example asdasd
     *
     * @var string
     */
    public $flowId;

    // 签署链接数组
    /**
     * @example -
     *
     * @var SignUrlResp[]
     */
    public $signUrlList;
    protected $_name = [
        'flowId'      => 'flow_id',
        'signUrlList' => 'sign_url_list',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('signUrlList', $this->signUrlList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->signUrlList) {
            $res['sign_url_list'] = [];
            if (null !== $this->signUrlList && \is_array($this->signUrlList)) {
                $n = 0;
                foreach ($this->signUrlList as $item) {
                    $res['sign_url_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractSignResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['sign_url_list'])) {
            if (!empty($map['sign_url_list'])) {
                $model->signUrlList = [];
                $n                  = 0;
                foreach ($map['sign_url_list'] as $item) {
                    $model->signUrlList[$n++] = null !== $item ? SignUrlResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
