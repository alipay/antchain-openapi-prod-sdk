<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclContractInfo extends Model
{
    // 待签署,SIGNING
    // 拒签,REJECT
    // 签署失败,SIGN_FAIL
    // 签署完成,FINISH
    /**
     * @example SIGNING
     *
     * @var string
     */
    public $signStatus;

    // 签署完成的合同文件 只有签署完成才有
    /**
     * @example
     *
     * @var BclFileInfo[]
     */
    public $signedFiles;
    protected $_name = [
        'signStatus'  => 'sign_status',
        'signedFiles' => 'signed_files',
    ];

    public function validate()
    {
        Model::validateRequired('signStatus', $this->signStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signStatus) {
            $res['sign_status'] = $this->signStatus;
        }
        if (null !== $this->signedFiles) {
            $res['signed_files'] = [];
            if (null !== $this->signedFiles && \is_array($this->signedFiles)) {
                $n = 0;
                foreach ($this->signedFiles as $item) {
                    $res['signed_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclContractInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_status'])) {
            $model->signStatus = $map['sign_status'];
        }
        if (isset($map['signed_files'])) {
            if (!empty($map['signed_files'])) {
                $model->signedFiles = [];
                $n                  = 0;
                foreach ($map['signed_files'] as $item) {
                    $model->signedFiles[$n++] = null !== $item ? BclFileInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
