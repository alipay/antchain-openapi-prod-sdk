<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclContractFileInfo extends Model
{
    // 文件OSS Id
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b5.pdf
     *
     * @var string
     */
    public $ossFileId;

    // 买家用户签署区信息
    /**
     * @example
     *
     * @var BclSignField[]
     */
    public $userSignFields;

    // 租赁商家签署区信息
    /**
     * @example
     *
     * @var BclSignField[]
     */
    public $merchantSignFields;

    // 合同模板填充项内容扩展字段:
    // 以key:value传入，JSON对象模板签署链路，不能传"  "或空"{}"，k-v模式，k和v都必须有。
    // 当订单创建选择是模板签署时，该字段必填。
    /**
     * @example {"甲方":"测试甲方","乙方":"测试乙方"}
     *
     * @var string
     */
    public $simpleFormFields;
    protected $_name = [
        'ossFileId'          => 'oss_file_id',
        'userSignFields'     => 'user_sign_fields',
        'merchantSignFields' => 'merchant_sign_fields',
        'simpleFormFields'   => 'simple_form_fields',
    ];

    public function validate()
    {
        Model::validateRequired('ossFileId', $this->ossFileId, true);
        Model::validateRequired('userSignFields', $this->userSignFields, true);
        Model::validateMaxLength('ossFileId', $this->ossFileId, 64);
        Model::validateMaxLength('simpleFormFields', $this->simpleFormFields, 2048);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ossFileId) {
            $res['oss_file_id'] = $this->ossFileId;
        }
        if (null !== $this->userSignFields) {
            $res['user_sign_fields'] = [];
            if (null !== $this->userSignFields && \is_array($this->userSignFields)) {
                $n = 0;
                foreach ($this->userSignFields as $item) {
                    $res['user_sign_fields'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->merchantSignFields) {
            $res['merchant_sign_fields'] = [];
            if (null !== $this->merchantSignFields && \is_array($this->merchantSignFields)) {
                $n = 0;
                foreach ($this->merchantSignFields as $item) {
                    $res['merchant_sign_fields'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->simpleFormFields) {
            $res['simple_form_fields'] = $this->simpleFormFields;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclContractFileInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['oss_file_id'])) {
            $model->ossFileId = $map['oss_file_id'];
        }
        if (isset($map['user_sign_fields'])) {
            if (!empty($map['user_sign_fields'])) {
                $model->userSignFields = [];
                $n                     = 0;
                foreach ($map['user_sign_fields'] as $item) {
                    $model->userSignFields[$n++] = null !== $item ? BclSignField::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['merchant_sign_fields'])) {
            if (!empty($map['merchant_sign_fields'])) {
                $model->merchantSignFields = [];
                $n                         = 0;
                foreach ($map['merchant_sign_fields'] as $item) {
                    $model->merchantSignFields[$n++] = null !== $item ? BclSignField::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['simple_form_fields'])) {
            $model->simpleFormFields = $map['simple_form_fields'];
        }

        return $model;
    }
}
