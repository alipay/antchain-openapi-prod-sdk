<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_4b3196fa612148cd8407b20f4e5ed132\Models;

use AlibabaCloud\Tea\Model;

class ArSignConfig extends Model
{
    // 签约者类型，比如：BANK=银行
    /**
     * @example BANK
     *
     * @var string
     */
    public $arSignerType;

    // 签署区列表
    /**
     * @example
     *
     * @var ArSignField[]
     */
    public $arSignFields;

    // 签署人
    /**
     * @example
     *
     * @var Person
     */
    public $signer;
    protected $_name = [
        'arSignerType' => 'ar_signer_type',
        'arSignFields' => 'ar_sign_fields',
        'signer'       => 'signer',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->arSignerType) {
            $res['ar_signer_type'] = $this->arSignerType;
        }
        if (null !== $this->arSignFields) {
            $res['ar_sign_fields'] = [];
            if (null !== $this->arSignFields && \is_array($this->arSignFields)) {
                $n = 0;
                foreach ($this->arSignFields as $item) {
                    $res['ar_sign_fields'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signer) {
            $res['signer'] = null !== $this->signer ? $this->signer->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ArSignConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ar_signer_type'])) {
            $model->arSignerType = $map['ar_signer_type'];
        }
        if (isset($map['ar_sign_fields'])) {
            if (!empty($map['ar_sign_fields'])) {
                $model->arSignFields = [];
                $n                   = 0;
                foreach ($map['ar_sign_fields'] as $item) {
                    $model->arSignFields[$n++] = null !== $item ? ArSignField::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['signer'])) {
            $model->signer = Person::fromMap($map['signer']);
        }

        return $model;
    }
}
