#include <stdio.h>
#include <stddef.h>
#include <memory.h>

#ifndef bool
#define bool char
#define false ((bool)0)
#define true  ((bool)1)
#endif

#include "C:\graalvm-ce-java11-22.3.0\lib\svm\clibraries\windows-amd64\include\amd64cpufeatures.h"

int AMD64LibCHelperDirectives() {
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(CPUFeatures)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fADX:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fADX)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fADX:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fADX)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fADX = all_bits_set;
        is_unsigned = fieldHolder.fADX > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fADX:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAES:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAES)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAES:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAES)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAES = all_bits_set;
        is_unsigned = fieldHolder.fAES > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAES:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAMD_3DNOW_PREFETCH:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAMD_3DNOW_PREFETCH)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAMD_3DNOW_PREFETCH:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAMD_3DNOW_PREFETCH)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAMD_3DNOW_PREFETCH = all_bits_set;
        is_unsigned = fieldHolder.fAMD_3DNOW_PREFETCH > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAMD_3DNOW_PREFETCH:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX = all_bits_set;
        is_unsigned = fieldHolder.fAVX > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX2:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX2)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX2:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX2)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX2 = all_bits_set;
        is_unsigned = fieldHolder.fAVX2 > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX2:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512BW:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512BW)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512BW:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512BW)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512BW = all_bits_set;
        is_unsigned = fieldHolder.fAVX512BW > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512BW:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512CD:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512CD)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512CD:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512CD)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512CD = all_bits_set;
        is_unsigned = fieldHolder.fAVX512CD > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512CD:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512DQ:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512DQ)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512DQ:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512DQ)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512DQ = all_bits_set;
        is_unsigned = fieldHolder.fAVX512DQ > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512DQ:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512ER:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512ER)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512ER:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512ER)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512ER = all_bits_set;
        is_unsigned = fieldHolder.fAVX512ER > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512ER:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512F:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512F)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512F:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512F)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512F = all_bits_set;
        is_unsigned = fieldHolder.fAVX512F > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512F:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512PF:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512PF)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512PF:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512PF)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512PF = all_bits_set;
        is_unsigned = fieldHolder.fAVX512PF > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512PF:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512VL:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512VL)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512VL:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512VL)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512VL = all_bits_set;
        is_unsigned = fieldHolder.fAVX512VL > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512VL:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_BITALG:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512_BITALG)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_BITALG:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512_BITALG)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512_BITALG = all_bits_set;
        is_unsigned = fieldHolder.fAVX512_BITALG > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_BITALG:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VAES:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512_VAES)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VAES:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512_VAES)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512_VAES = all_bits_set;
        is_unsigned = fieldHolder.fAVX512_VAES > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VAES:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VBMI:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512_VBMI)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VBMI:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512_VBMI)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512_VBMI = all_bits_set;
        is_unsigned = fieldHolder.fAVX512_VBMI > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VBMI:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VBMI2:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512_VBMI2)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VBMI2:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512_VBMI2)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512_VBMI2 = all_bits_set;
        is_unsigned = fieldHolder.fAVX512_VBMI2 > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VBMI2:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VNNI:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512_VNNI)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VNNI:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512_VNNI)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512_VNNI = all_bits_set;
        is_unsigned = fieldHolder.fAVX512_VNNI > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VNNI:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VPCLMULQDQ:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512_VPCLMULQDQ)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VPCLMULQDQ:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512_VPCLMULQDQ)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512_VPCLMULQDQ = all_bits_set;
        is_unsigned = fieldHolder.fAVX512_VPCLMULQDQ > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VPCLMULQDQ:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VPOPCNTDQ:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fAVX512_VPOPCNTDQ)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VPOPCNTDQ:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fAVX512_VPOPCNTDQ)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fAVX512_VPOPCNTDQ = all_bits_set;
        is_unsigned = fieldHolder.fAVX512_VPOPCNTDQ > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fAVX512_VPOPCNTDQ:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fBMI1:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fBMI1)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fBMI1:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fBMI1)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fBMI1 = all_bits_set;
        is_unsigned = fieldHolder.fBMI1 > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fBMI1:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fBMI2:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fBMI2)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fBMI2:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fBMI2)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fBMI2 = all_bits_set;
        is_unsigned = fieldHolder.fBMI2 > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fBMI2:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCLMUL:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fCLMUL)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCLMUL:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fCLMUL)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fCLMUL = all_bits_set;
        is_unsigned = fieldHolder.fCLMUL > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCLMUL:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCLWB:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fCLWB)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCLWB:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fCLWB)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fCLWB = all_bits_set;
        is_unsigned = fieldHolder.fCLWB > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCLWB:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCMOV:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fCMOV)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCMOV:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fCMOV)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fCMOV = all_bits_set;
        is_unsigned = fieldHolder.fCMOV > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCMOV:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCX8:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fCX8)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCX8:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fCX8)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fCX8 = all_bits_set;
        is_unsigned = fieldHolder.fCX8 > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fCX8:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fERMS:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fERMS)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fERMS:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fERMS)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fERMS = all_bits_set;
        is_unsigned = fieldHolder.fERMS > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fERMS:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFLUSH:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fFLUSH)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFLUSH:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fFLUSH)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fFLUSH = all_bits_set;
        is_unsigned = fieldHolder.fFLUSH > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFLUSH:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFLUSHOPT:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fFLUSHOPT)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFLUSHOPT:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fFLUSHOPT)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fFLUSHOPT = all_bits_set;
        is_unsigned = fieldHolder.fFLUSHOPT > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFLUSHOPT:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFMA:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fFMA)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFMA:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fFMA)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fFMA = all_bits_set;
        is_unsigned = fieldHolder.fFMA > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFMA:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFSRM:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fFSRM)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFSRM:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fFSRM)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fFSRM = all_bits_set;
        is_unsigned = fieldHolder.fFSRM > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFSRM:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFXSR:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fFXSR)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFXSR:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fFXSR)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fFXSR = all_bits_set;
        is_unsigned = fieldHolder.fFXSR > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fFXSR:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fGFNI:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fGFNI)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fGFNI:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fGFNI)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fGFNI = all_bits_set;
        is_unsigned = fieldHolder.fGFNI > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fGFNI:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fHT:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fHT)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fHT:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fHT)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fHT = all_bits_set;
        is_unsigned = fieldHolder.fHT > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fHT:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fHV:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fHV)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fHV:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fHV)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fHV = all_bits_set;
        is_unsigned = fieldHolder.fHV > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fHV:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fLZCNT:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fLZCNT)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fLZCNT:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fLZCNT)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fLZCNT = all_bits_set;
        is_unsigned = fieldHolder.fLZCNT > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fLZCNT:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fMMX:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fMMX)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fMMX:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fMMX)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fMMX = all_bits_set;
        is_unsigned = fieldHolder.fMMX > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fMMX:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fPOPCNT:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fPOPCNT)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fPOPCNT:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fPOPCNT)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fPOPCNT = all_bits_set;
        is_unsigned = fieldHolder.fPOPCNT > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fPOPCNT:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fRDPID:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fRDPID)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fRDPID:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fRDPID)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fRDPID = all_bits_set;
        is_unsigned = fieldHolder.fRDPID > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fRDPID:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fRDTSCP:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fRDTSCP)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fRDTSCP:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fRDTSCP)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fRDTSCP = all_bits_set;
        is_unsigned = fieldHolder.fRDTSCP > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fRDTSCP:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fRTM:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fRTM)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fRTM:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fRTM)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fRTM = all_bits_set;
        is_unsigned = fieldHolder.fRTM > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fRTM:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSERIALIZE:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fSERIALIZE)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSERIALIZE:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fSERIALIZE)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fSERIALIZE = all_bits_set;
        is_unsigned = fieldHolder.fSERIALIZE > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSERIALIZE:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSHA:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fSHA)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSHA:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fSHA)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fSHA = all_bits_set;
        is_unsigned = fieldHolder.fSHA > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSHA:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fSSE)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fSSE)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fSSE = all_bits_set;
        is_unsigned = fieldHolder.fSSE > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE2:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fSSE2)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE2:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fSSE2)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fSSE2 = all_bits_set;
        is_unsigned = fieldHolder.fSSE2 > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE2:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE3:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fSSE3)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE3:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fSSE3)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fSSE3 = all_bits_set;
        is_unsigned = fieldHolder.fSSE3 > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE3:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE4A:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fSSE4A)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE4A:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fSSE4A)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fSSE4A = all_bits_set;
        is_unsigned = fieldHolder.fSSE4A > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE4A:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE4_1:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fSSE4_1)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE4_1:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fSSE4_1)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fSSE4_1 = all_bits_set;
        is_unsigned = fieldHolder.fSSE4_1 > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE4_1:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE4_2:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fSSE4_2)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE4_2:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fSSE4_2)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fSSE4_2 = all_bits_set;
        is_unsigned = fieldHolder.fSSE4_2 > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSE4_2:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSSE3:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fSSSE3)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSSE3:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fSSSE3)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fSSSE3 = all_bits_set;
        is_unsigned = fieldHolder.fSSSE3 > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fSSSE3:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fTSC:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fTSC)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fTSC:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fTSC)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fTSC = all_bits_set;
        is_unsigned = fieldHolder.fTSC > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fTSC:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fTSCINV:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fTSCINV)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fTSCINV:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fTSCINV)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fTSCINV = all_bits_set;
        is_unsigned = fieldHolder.fTSCINV > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fTSCINV:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fTSCINV_BIT:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fTSCINV_BIT)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fTSCINV_BIT:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fTSCINV_BIT)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fTSCINV_BIT = all_bits_set;
        is_unsigned = fieldHolder.fTSCINV_BIT > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fTSCINV_BIT:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fVZEROUPPER:PropertyInfo:size=%llu\n", ((unsigned long long)sizeof(((CPUFeatures *) 0)->fVZEROUPPER)));
    printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fVZEROUPPER:PropertyInfo:offset=%llu\n", ((unsigned long long)offsetof(CPUFeatures, fVZEROUPPER)));
    {
        int is_unsigned;
        unsigned long long all_bits_set = -1;
        CPUFeatures fieldHolder;
        memset(&fieldHolder, 0x0, sizeof(fieldHolder));
        fieldHolder.fVZEROUPPER = all_bits_set;
        is_unsigned = fieldHolder.fVZEROUPPER > 0;
        printf("NativeCodeInfo:AMD64LibCHelperDirectives:StructInfo:CPUFeatures:StructFieldInfo:fVZEROUPPER:PropertyInfo:signedness=$%s$\n", (is_unsigned) ? "UNSIGNED" : "SIGNED");
    }
    return 0;
}

int main(void) {
    return AMD64LibCHelperDirectives();
}
