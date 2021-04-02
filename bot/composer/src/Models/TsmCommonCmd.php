<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TsmCommonCmd extends Model
{
    // private byte cla;
    /**
     * @example 00
     *
     * @var int
     */
    public $cla;

    // host challenge data.
    /**
     * @example [0,0]
     *
     * @var int[]
     */
    public $data;

    // private byte ins;
    /**
     * @example 00
     *
     * @var int
     */
    public $ins;

    // private byte lc;
    /**
     * @example lc
     *
     * @var int
     */
    public $lc;

    // private byte le = (byte) 0x00;
    /**
     * @example 0
     *
     * @var int
     */
    public $le;

    // private Boolean needSecurityHandle = Boolean.TRUE;
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needSecurityHandle;

    // private byte p1;
    /**
     * @example 00
     *
     * @var int
     */
    public $p1;

    // private byte p2 = (byte) 0x00;
    /**
     * @example 00
     *
     * @var int
     */
    public $p2;
    protected $_name = [
        'cla'                => 'cla',
        'data'               => 'data',
        'ins'                => 'ins',
        'lc'                 => 'lc',
        'le'                 => 'le',
        'needSecurityHandle' => 'need_security_handle',
        'p1'                 => 'p1',
        'p2'                 => 'p2',
    ];

    public function validate()
    {
        Model::validateRequired('cla', $this->cla, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('ins', $this->ins, true);
        Model::validateRequired('lc', $this->lc, true);
        Model::validateRequired('p1', $this->p1, true);
        Model::validateRequired('p2', $this->p2, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cla) {
            $res['cla'] = $this->cla;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->ins) {
            $res['ins'] = $this->ins;
        }
        if (null !== $this->lc) {
            $res['lc'] = $this->lc;
        }
        if (null !== $this->le) {
            $res['le'] = $this->le;
        }
        if (null !== $this->needSecurityHandle) {
            $res['need_security_handle'] = $this->needSecurityHandle;
        }
        if (null !== $this->p1) {
            $res['p1'] = $this->p1;
        }
        if (null !== $this->p2) {
            $res['p2'] = $this->p2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TsmCommonCmd
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cla'])) {
            $model->cla = $map['cla'];
        }
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = $map['data'];
            }
        }
        if (isset($map['ins'])) {
            $model->ins = $map['ins'];
        }
        if (isset($map['lc'])) {
            $model->lc = $map['lc'];
        }
        if (isset($map['le'])) {
            $model->le = $map['le'];
        }
        if (isset($map['need_security_handle'])) {
            $model->needSecurityHandle = $map['need_security_handle'];
        }
        if (isset($map['p1'])) {
            $model->p1 = $map['p1'];
        }
        if (isset($map['p2'])) {
            $model->p2 = $map['p2'];
        }

        return $model;
    }
}
