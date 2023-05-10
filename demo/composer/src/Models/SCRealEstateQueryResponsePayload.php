<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class SCRealEstateQueryResponsePayload extends Model
{
    // code
    /**
     * @example 200
     *
     * @var string
     */
    public $code;

    // data
    /**
     * @example
     *
     * @var SCRealEstateQueryResponseData[]
     */
    public $data;

    // uuid
    /**
     * @example uuid
     *
     * @var string
     */
    public $uuid;

    // ret_msg
    /**
     * @example ret_msg
     *
     * @var string
     */
    public $retMsg;
    protected $_name = [
        'code'   => 'code',
        'data'   => 'data',
        'uuid'   => 'uuid',
        'retMsg' => 'ret_msg',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('uuid', $this->uuid, true);
        Model::validateRequired('retMsg', $this->retMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->data) {
            $res['data'] = [];
            if (null !== $this->data && \is_array($this->data)) {
                $n = 0;
                foreach ($this->data as $item) {
                    $res['data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->retMsg) {
            $res['ret_msg'] = $this->retMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SCRealEstateQueryResponsePayload
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = [];
                $n           = 0;
                foreach ($map['data'] as $item) {
                    $model->data[$n++] = null !== $item ? SCRealEstateQueryResponseData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['ret_msg'])) {
            $model->retMsg = $map['ret_msg'];
        }

        return $model;
    }
}
