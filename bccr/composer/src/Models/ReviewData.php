<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ReviewData extends Model
{
    // 作品名称安全识别结果
    /**
     * @example
     *
     * @var ContentRiskData[]
     */
    public $titleRiskData;

    // 内容安全识别结果
    /**
     * @example
     *
     * @var ContentRiskData[]
     */
    public $contentRiskData;

    // 作品相似识别结果
    /**
     * @example
     *
     * @var ResembleRiskData[]
     */
    public $resembleRiskData;

    // 作品标签识别结果
    /**
     * @example
     *
     * @var LabelRiskData[]
     */
    public $labelRiskData;
    protected $_name = [
        'titleRiskData'    => 'title_risk_data',
        'contentRiskData'  => 'content_risk_data',
        'resembleRiskData' => 'resemble_risk_data',
        'labelRiskData'    => 'label_risk_data',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->titleRiskData) {
            $res['title_risk_data'] = [];
            if (null !== $this->titleRiskData && \is_array($this->titleRiskData)) {
                $n = 0;
                foreach ($this->titleRiskData as $item) {
                    $res['title_risk_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->contentRiskData) {
            $res['content_risk_data'] = [];
            if (null !== $this->contentRiskData && \is_array($this->contentRiskData)) {
                $n = 0;
                foreach ($this->contentRiskData as $item) {
                    $res['content_risk_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->resembleRiskData) {
            $res['resemble_risk_data'] = [];
            if (null !== $this->resembleRiskData && \is_array($this->resembleRiskData)) {
                $n = 0;
                foreach ($this->resembleRiskData as $item) {
                    $res['resemble_risk_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->labelRiskData) {
            $res['label_risk_data'] = [];
            if (null !== $this->labelRiskData && \is_array($this->labelRiskData)) {
                $n = 0;
                foreach ($this->labelRiskData as $item) {
                    $res['label_risk_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReviewData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title_risk_data'])) {
            if (!empty($map['title_risk_data'])) {
                $model->titleRiskData = [];
                $n                    = 0;
                foreach ($map['title_risk_data'] as $item) {
                    $model->titleRiskData[$n++] = null !== $item ? ContentRiskData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['content_risk_data'])) {
            if (!empty($map['content_risk_data'])) {
                $model->contentRiskData = [];
                $n                      = 0;
                foreach ($map['content_risk_data'] as $item) {
                    $model->contentRiskData[$n++] = null !== $item ? ContentRiskData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['resemble_risk_data'])) {
            if (!empty($map['resemble_risk_data'])) {
                $model->resembleRiskData = [];
                $n                       = 0;
                foreach ($map['resemble_risk_data'] as $item) {
                    $model->resembleRiskData[$n++] = null !== $item ? ResembleRiskData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['label_risk_data'])) {
            if (!empty($map['label_risk_data'])) {
                $model->labelRiskData = [];
                $n                    = 0;
                foreach ($map['label_risk_data'] as $item) {
                    $model->labelRiskData[$n++] = null !== $item ? LabelRiskData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
