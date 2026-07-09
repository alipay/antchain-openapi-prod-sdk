<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CollectLabelRawContent extends Model
{
    // 1.设备端上报数据内容 2.与设备上报的数据一致，服务端不可修改 3.解析后需与DataModel匹配 4.映射 Label 对象结构化存储 5.转为JSON后如果是JSONObject 映射单个 Label 6.转为JSON后如果是JSONArray 映射多个 Label
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $content;

    // 数据模型ID
    /**
     * @example 001202103171566166669
     *
     * @var string
     */
    public $dataModelId;
    protected $_name = [
        'content'     => 'content',
        'dataModelId' => 'data_model_id',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('dataModelId', $this->dataModelId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CollectLabelRawContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }

        return $model;
    }
}
