<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class AllCommercialcoreCatalogResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 全部类目树结构体
    /**
     * @var CatalogVO[]
     */
    public $catalogTrees;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'catalogTrees' => 'catalog_trees',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->catalogTrees) {
            $res['catalog_trees'] = [];
            if (null !== $this->catalogTrees && \is_array($this->catalogTrees)) {
                $n = 0;
                foreach ($this->catalogTrees as $item) {
                    $res['catalog_trees'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllCommercialcoreCatalogResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['catalog_trees'])) {
            if (!empty($map['catalog_trees'])) {
                $model->catalogTrees = [];
                $n                   = 0;
                foreach ($map['catalog_trees'] as $item) {
                    $model->catalogTrees[$n++] = null !== $item ? CatalogVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
