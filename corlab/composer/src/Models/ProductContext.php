<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class ProductContext extends Model
{
    // 产品code
    /**
     * @example aft_v4
     *
     * @var string
     */
    public $productCode;

    // 模版code
    /**
     * @example tb-default
     *
     * @var string
     */
    public $templateCode;

    // 模版内容,数组
    /**
     * @example
     *
     * @var TemplateContext[]
     */
    public $templateContext;
    protected $_name = [
        'productCode'     => 'product_code',
        'templateCode'    => 'template_code',
        'templateContext' => 'template_context',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('templateContext', $this->templateContext, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->templateContext) {
            $res['template_context'] = [];
            if (null !== $this->templateContext && \is_array($this->templateContext)) {
                $n = 0;
                foreach ($this->templateContext as $item) {
                    $res['template_context'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductContext
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['template_context'])) {
            if (!empty($map['template_context'])) {
                $model->templateContext = [];
                $n                      = 0;
                foreach ($map['template_context'] as $item) {
                    $model->templateContext[$n++] = null !== $item ? TemplateContext::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
